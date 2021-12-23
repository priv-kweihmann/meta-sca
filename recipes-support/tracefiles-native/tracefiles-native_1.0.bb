SUMMARY = "Map package files to source files"
DESCRIPTION = "Support utility to map packaged files back to sources files.\
               For binaries it uses the DWARF information to retrieve original sources.\
               For all non-binaries to tries a lookup in the original source tree"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${WORKDIR}/tracefiles.py;beginline=2;endline=30;md5=fd6717d17a1c61afc260c1dbdb277618"

DEPENDS += "python3-pyelftools-native"

SRC_URI = "file://tracefiles.py"

inherit native

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d "${D}${bindir}"
    install -m 0755 ${WORKDIR}/tracefiles.py ${D}${bindir}/tracefiles
}
