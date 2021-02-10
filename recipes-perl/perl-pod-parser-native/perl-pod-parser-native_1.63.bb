SUMMARY = "Various pod modules"
HOMEPAGE = "https://metacpan.org/pod/Pod-Parser"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=84;endline=131;md5=ab4a103dd819bcc3dc34bced058717d1"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MAREKR/Pod-Parser-${PV}.tar.gz"

SRC_URI[md5sum] = "d8e0d60e03d77442d354fd567e469ae4"
SRC_URI[sha256sum] = "dbe0b56129975b2f83a02841e8e0ed47be80f060686c66ea37e529d97aa70ccd"

S = "${WORKDIR}/Pod-Parser-${PV}"

inherit cpan
inherit native

do_install_append() {
    # remove as it's supplied by perl itself
    rm ${D}${bindir}/podselect
}
