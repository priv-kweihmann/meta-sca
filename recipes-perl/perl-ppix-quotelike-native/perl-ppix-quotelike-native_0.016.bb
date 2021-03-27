SUMMARY = "Parse Perl string literals and string-literal-like things"
HOMEPAGE = "https://metacpan.org/pod/PPIx::QuoteLike"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=48;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-QuoteLike-${PV}.tar.gz"

SRC_URI[md5sum] = "378795bdf00c2412d2e9645bf40d3d10"
SRC_URI[sha256sum] = "5e995cb8de58379f2655a10972e58b8183e919d8f153e753c4e18215e92443c8"

S = "${WORKDIR}/PPIx-QuoteLike-${PV}"

inherit cpan_build
inherit native
