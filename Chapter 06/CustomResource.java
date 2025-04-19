class CustomResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("CustomResource is now closed.");
    }

    public void use() {
        System.out.println("Using CustomResource . . .");
    }
}
