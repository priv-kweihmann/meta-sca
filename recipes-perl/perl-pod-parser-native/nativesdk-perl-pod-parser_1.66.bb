SUMMARY = "Various pod modules"
HOMEPAGE = "https://metacpan.org/pod/Pod-Parser"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=84;endline=131;md5=788bc73c4211553b7f78c9b0cc62a7e5"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MAREKR/Pod-Parser-${PV}.tar.gz"

SRC_URI[md5sum] = "c1d20031bc2b75ea0fe7bf6d313b1d30"
SRC_URI[sha256sum] = "22928a7bffe61b452c05bbbb8f5216d4b9cf9fe2a849b776c25500d24d20df7c"

S = "${WORKDIR}/Pod-Parser-${PV}"

inherit cpan
inherit nativesdk

do_install:append() {
    # remove as it's supplied by perl itself
    rm ${D}${bindir}/podselect
}

FILES:${PN} += "${bindir}"
