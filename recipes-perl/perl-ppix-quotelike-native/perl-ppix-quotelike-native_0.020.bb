SUMMARY = "Parse Perl string literals and string-literal-like things"
HOMEPAGE = "https://metacpan.org/pod/PPIx::QuoteLike"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=48;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-QuoteLike-${PV}.tar.gz"

SRC_URI[md5sum] = "37c829ff36570827c3203020193e25ac"
SRC_URI[sha256sum] = "860593a44d4c0fa40616232fc904aa46af46f03af64f4bcea044f8e7a2e2fc28"

S = "${WORKDIR}/PPIx-QuoteLike-${PV}"

inherit cpan_build
inherit cpan-upgrade-check
inherit native
