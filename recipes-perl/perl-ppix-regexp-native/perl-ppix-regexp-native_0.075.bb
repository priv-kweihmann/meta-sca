SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "ce401f07111d9c8d3cf43ab45d2aec99"
SRC_URI[sha256sum] = "638095c9e827207bb316c4e1a3c0830526055504b91f936b7431b3ac8282136e"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

inherit native
inherit cpan_build
