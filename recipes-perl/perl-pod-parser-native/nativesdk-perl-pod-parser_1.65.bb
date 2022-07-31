SUMMARY = "Various pod modules"
HOMEPAGE = "https://metacpan.org/pod/Pod-Parser"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=84;endline=131;md5=ab4a103dd819bcc3dc34bced058717d1"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MAREKR/Pod-Parser-${PV}.tar.gz"

SRC_URI[md5sum] = "cba18cb7ebe7d3d8af888c57dbb3884b"
SRC_URI[sha256sum] = "3ba7bdec659416a51fe2a7e59f0883e9c6a3b21bc9d001042c1d6a32d401b28a"

S = "${WORKDIR}/Pod-Parser-${PV}"

inherit cpan
inherit nativesdk

do_install:append() {
    # remove as it's supplied by perl itself
    rm ${D}${bindir}/podselect
}

FILES:${PN} += "${bindir}"
