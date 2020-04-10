SUMMARY = "Parse Perl string literals and string-literal-like things"
HOMEPAGE = "https://metacpan.org/pod/PPIx::QuoteLike"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=48;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-QuoteLike-${PV}.tar.gz"

SRC_URI[md5sum] = "c72719436dec66c0e3f66bd5cc46a031"
SRC_URI[sha256sum] = "4ed7c7a477d94c4a7d7d7a0723f1149eb4f5af89f5fcd4ca0bff0e6751cf207a"

S = "${WORKDIR}/PPIx-QuoteLike-${PV}"

inherit native
inherit cpan_build
