SUMMARY = "Parse Perl string literals and string-literal-like things"
HOMEPAGE = "https://metacpan.org/pod/PPIx::QuoteLike"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=48;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-QuoteLike-${PV}.tar.gz"

SRC_URI[md5sum] = "8770268263a99492e20a5638064f2b8c"
SRC_URI[sha256sum] = "6561bb6df85eda59651bdc1a5c0987078fb794fb8d9595896b19c779002e83b6"

S = "${WORKDIR}/PPIx-QuoteLike-${PV}"

inherit native
inherit cpan_build
