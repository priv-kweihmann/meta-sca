SUMMARY = "Various pod modules"
HOMEPAGE = "https://metacpan.org/pod/Pod-Parser"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=84;endline=131;md5=788bc73c4211553b7f78c9b0cc62a7e5"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MAREKR/Pod-Parser-${PV}.tar.gz"

SRC_URI[md5sum] = "8ef9384e522e201400a73780348e4f79"
SRC_URI[sha256sum] = "5deccbf55d750ce65588cd211c1a03fa1ef3aaa15d1ac2b8d85383a42c1427ea"

S = "${WORKDIR}/Pod-Parser-${PV}"

inherit cpan
inherit nativesdk

do_install:append() {
    # remove as it's supplied by perl itself
    rm ${D}${bindir}/podselect
}

FILES:${PN} += "${bindir}"
