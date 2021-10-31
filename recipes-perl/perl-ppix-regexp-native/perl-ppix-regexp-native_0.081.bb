SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "995193d3fa26aa5ceb124e3672c81e0b"
SRC_URI[sha256sum] = "9d1fe0ea96e0b75b8273891462ee22fcead679fdbd830fbaffce3c79794e0f5d"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

inherit cpan_build
inherit cpan-upgrade-check
inherit native
