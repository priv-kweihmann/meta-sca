## Tool isn't supported by python2

LICENSE ?= "BSD-2-Clause"
LIC_FILES_CHKSUM ?= "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

do_unpack() {
    bbfatal "darglint requires python3 - Please disable this tool for python2"
}
