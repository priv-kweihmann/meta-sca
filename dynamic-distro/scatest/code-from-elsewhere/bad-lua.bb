SUMMARY = "Bad lua testcode"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78c1d9d1063a2e3c98965716ac8494f0"

SRC_URI = "git://github.com/mpeterv/luacheck.git;branch=master;protocol=https"
SRCREV = "76bb56736702e8651537b2a9c10ae55ab7dc1d5d"

S = "${WORKDIR}/git"
inherit sca

do_configure() {
    :
}

do_compile() {
    :
}

do_install() {
    :
}

## Use luacheck test code
SCA_SOURCES_DIR = "${WORKDIR}/git/spec/samples"
