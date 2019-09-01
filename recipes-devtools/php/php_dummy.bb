## This is dummy recipe we can use to have a bbappend in our layer
## the only purpose of this file is to warn you
## that meta-oe is needed to enable php support

LICENSE = "Unlicense"

do_configure() {
    bbfatal "You need to install meta-oe to use this here"
}

BBCLASSEXTEND = "native"