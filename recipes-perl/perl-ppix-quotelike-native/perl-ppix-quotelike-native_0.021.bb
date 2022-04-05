SUMMARY = "Parse Perl string literals and string-literal-like things"
HOMEPAGE = "https://metacpan.org/pod/PPIx::QuoteLike"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=48;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-QuoteLike-${PV}.tar.gz"

SRC_URI[md5sum] = "4eb9a5324518afc9aa5cc5dcc0ec8a76"
SRC_URI[sha256sum] = "1ebf223eae99db42281a834ea0d4b6a95b9d4192bf94fa4ac6a6a5c00a5cff67"

S = "${WORKDIR}/PPIx-QuoteLike-${PV}"

inherit cpan_build
inherit cpan-upgrade-check
inherit native
