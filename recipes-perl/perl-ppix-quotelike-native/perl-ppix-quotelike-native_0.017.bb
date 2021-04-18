SUMMARY = "Parse Perl string literals and string-literal-like things"
HOMEPAGE = "https://metacpan.org/pod/PPIx::QuoteLike"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=48;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-QuoteLike-${PV}.tar.gz"

SRC_URI[md5sum] = "9d1813303778048819f9945abd3f2b06"
SRC_URI[sha256sum] = "33b79a408468decca1bfac1f0bfb4aed2dab35eafda4128d00502514da438beb"

S = "${WORKDIR}/PPIx-QuoteLike-${PV}"

inherit cpan_build
inherit cpan-upgrade-check
inherit native
