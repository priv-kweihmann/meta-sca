## This is dummy recipe we can use to have a bbappend in our layer
## the only purpose of this file is to warn you
## that meta-clang is needed to enable clang support

LICENSE = "Unlicense"

do_configure() {
    bbfatal "You need to install meta-clang to use this here"
}

BBCLASSEXTEND = "native"