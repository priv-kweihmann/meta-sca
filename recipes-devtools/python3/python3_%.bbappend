do_install_append_class-target() {
    # Out of unknown reasons it happens from time to time
    # that __pycache__-files from the tests package get lost between
    # install and package
    # as we don't really need these files
    # also the python3-manifest doesn't really state, that
    # should be pycaches for tests
    # So it's better to remove them before packaging
    # otherwise build failures with traces like this occur
    # Exception: FileNotFoundError: [Errno 2] 
    #     No such file or directory: '...usr/lib/python3.7/distutils/tests/__pycache__/test_clean.cpython-37.pyc'

    # The used search pattern are derived from python3-manifest:tests
    set +e
    find ${D} -type d -wholename "*/test/__pycache_*" -exec rm -rf "{}" \;
    find ${D} -type d -wholename "*/tests/__pycache_*" -exec rm -rf "{}" \;
    find ${D} -type d -wholename "*/idle_test/__pycache_*" -exec rm -rf "{}" \;
    find ${D} -type d -wholename "*/test/*/__pycache_*" -exec rm -rf "{}" \;
    find ${D} -type d -wholename "*/tests/*/__pycache_*" -exec rm -rf "{}" \;
    find ${D} -type d -wholename "*/idle_test/*/__pycache_*" -exec rm -rf "{}" \;
    set -e
}