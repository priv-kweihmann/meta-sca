SUMMARY = "recursively copy Perl datatypes"
HOMEPAGE = "https://metacpan.org/pod/Clone"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=66;endline=70;md5=6bb054d6045f25815f998df561918381"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/Clone-${PV}.tar.gz"

SRC_URI[md5sum] = "12e2247a3c9802bae774daac32d083c1"
SRC_URI[sha256sum] = "99025344686535c1ded464fe126df900b645b858e6d8873635ba81b4882eeeda"

S = "${WORKDIR}/Clone-${PV}"

inherit native
inherit cpan
