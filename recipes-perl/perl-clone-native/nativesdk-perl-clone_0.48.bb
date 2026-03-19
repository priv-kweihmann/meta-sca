SUMMARY = "recursively copy Perl datatypes"
HOMEPAGE = "https://metacpan.org/pod/Clone"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=217;endline=220;md5=c6eace11110d07e007cb7c426d201ddd"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/Clone-${PV}.tar.gz"

SRC_URI[md5sum] = "f4059d9ef1a1d05bc545ad79e8683645"
SRC_URI[sha256sum] = "321d4cd1078e19519600abd7bda2991b468603c58455479e3d2e25a5acb1911f"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Clone-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer nativesdk
