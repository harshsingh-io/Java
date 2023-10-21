package com.thealgorithms.geometry;

public class BresenhamLineAlgorithm {
    /*
     * Bresenham's Line Algorithm in Java
     *
     * This Java program calculates and displays the points on a line between two given coordinates.
     * The algorithm is used for efficiently drawing lines on a grid.
     *
     * The algorithm is based on calculating the differences between the x and y coordinates,
     * determining the direction for incrementing x and y, initializing an error term, and looping
     * through the line's coordinates, adjusting them to ensure accurate line drawing.
     *
     * The 'drawLine' method calculates and displays the points on the line.
     *
     * Reference:
     * - Bresenham's Line Algorithm: https://en.wikipedia.org/wiki/Bresenham%27s_line_algorithm
     */
    public static void drawLine(int x1, int y1, int x2, int y2) {
        // Calculate the differences in x and y coordinates
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        // Determine the direction (1 or -1) in which to increment x and y
        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;

        // Initialize the error term
        int err = dx - dy;

        // Loop through the coordinates along the line
        while (x1 != x2 || y1 != y2) {
            // Draw the current point (x1, y1) here, you can replace this line
            // with your own logic to use the point for drawing or other purposes
            System.out.println("Point: (" + x1 + ", " + y1 + ")");

            // Calculate the error term times 2
            int e2 = 2 * err;

            // Update the x coordinate and error term if applicable
            if (e2 > -dy) {
                err -= dy;
                x1 += sx;
            }

            // Update the y coordinate and error term if applicable
            if (e2 < dx) {
                err += dx;
                y1 += sy;
            }
        }
    }

    public static void main(String[] args) {
        // Define the starting and ending points of the line
        int x1 = 2, y1 = 3;
        int x2 = 9, y2 = 7;

        // Call the drawLine function to calculate and display the points on the line
        drawLine(x1, y1, x2, y2);
    }
}

