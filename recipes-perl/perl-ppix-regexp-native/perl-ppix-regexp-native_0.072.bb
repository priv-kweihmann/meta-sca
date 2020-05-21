SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "302a3521ad9cbfef63c51572b8d9c3cc"
SRC_URI[sha256sum] = "84a050b3b65c98a4b95f9df94fa0d8db9a931b000bb6e2946f0f8874cc2bac5c"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

inherit native
inherit cpan_build
