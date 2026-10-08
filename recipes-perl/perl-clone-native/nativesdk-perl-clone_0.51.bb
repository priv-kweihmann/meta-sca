SUMMARY = "recursively copy Perl datatypes"
HOMEPAGE = "https://metacpan.org/pod/Clone"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Artistic-1.0 AND GPL-2.0-only"
LIC_FILES_CHKSUM = "file://README.md;beginline=212;endline=219;md5=6d14e4391c97817fc076dd25a84b5cc8"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/Clone-${PV}.tar.gz"

SRC_URI[md5sum] = "dfd3f7bffd1c2725f0d114c2ee2880a5"
SRC_URI[sha256sum] = "f17f66fec97dacca67ac9585701d2d079cfc80539fe6e8160c201c4e55f67507"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Clone-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer nativesdk
