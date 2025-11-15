SUMMARY = "recursively copy Perl datatypes"
HOMEPAGE = "https://metacpan.org/pod/Clone"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=66;endline=70;md5=e430f4c337d493361d28d481121f38bc"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/Clone-${PV}.tar.gz"

SRC_URI[md5sum] = "62ff032a4df0c4abb74f76adf519361e"
SRC_URI[sha256sum] = "4c2c0cb9a483efbf970cb1a75b2ca75b0e18cb84bcb5c09624f86e26b09c211d"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Clone-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer native
