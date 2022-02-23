SUMMARY = "Parse Perl string literals and string-literal-like things"
HOMEPAGE = "https://metacpan.org/pod/PPIx::QuoteLike"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=48;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-QuoteLike-${PV}.tar.gz"

SRC_URI[md5sum] = "e0df0cf36bdf71c759f2e94b07c17eda"
SRC_URI[sha256sum] = "b0717ff6128d930665a821c9ba68bc6d2327d6a35970b23cca94180a75f10c64"

S = "${WORKDIR}/PPIx-QuoteLike-${PV}"

inherit cpan_build
inherit cpan-upgrade-check
inherit native
