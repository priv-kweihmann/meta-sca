SUMMARY = "recursively copy Perl datatypes"
HOMEPAGE = "https://metacpan.org/pod/Clone"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README.md;beginline=217;endline=220;md5=c6eace11110d07e007cb7c426d201ddd"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/Clone-${PV}.tar.gz"

SRC_URI[md5sum] = "792aa8855c32abb22b814cd9182076e5"
SRC_URI[sha256sum] = "f9732a4a857974db30905233589113003301b585b0cecda29a21cfba5bb014f9"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Clone-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer nativesdk
