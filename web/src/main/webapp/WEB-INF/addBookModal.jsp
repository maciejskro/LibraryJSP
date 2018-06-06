<div class="container">
    <!-- Modal -->
    <div class="modal fade" id="addBookModal" role="dialog">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Add new book to inventory</h4>
                </div>
                <link rel="stylesheet" href="resources/floating-labels.css"/>
                <div class="form-control">
                <form class="form-signin-modal">
                    <div class="modal-body">

                        <div class="form-label-group">

                            <input type="text" class="form-control" name="title" aria-labelledby="titleInput"
                                   id="titleInput" placeholder="Enter title book" required autofocus \>
                            <label for="titleInput">book title</label>
                        </div>

                        <div class="form-label-group">
                            <input type="text" class="form-control" name="isbn" aria-labelledby="isbnInput"
                                   id="isbnInput" placeholder="Enter isbn" required autofocus >
                            <label for="isbnInput">ISBN</label>
                        </div>

                        <div class="form-label-group">
                            <select class="custom-select mr-1 mr-sm-2" id="categoryInput" placeholder="Choose category ">
                                <option>one</option>
                                <option>two</option>
                            </select>

                            <label for="categoryInput">choose category</label>
                        </div>

                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-primary" data-dismiss="modal">Add</button>
                    </div>
                </form>
                </div>
            </div>
        </div>
    </div>
</div>