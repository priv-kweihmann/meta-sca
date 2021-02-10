SUMMARY = "recursively copy Perl datatypes"
HOMEPAGE = "https://metacpan.org/pod/Clone"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=66;endline=70;md5=6bb054d6045f25815f998df561918381"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/Clone-${PV}.tar.gz"

SRC_URI[md5sum] = "b101333499b638658f89e29458cd83c0"
SRC_URI[sha256sum] = "cbb6ee348afa95432e4878893b46752549e70dc68fe6d9e430d1d2e99079a9e6"

S = "${WORKDIR}/Clone-${PV}"

inherit cpan
inherit native
