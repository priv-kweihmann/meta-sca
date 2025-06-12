SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "1bcdcb29b0f2d83c5ddeca98d9bf505c"
SRC_URI[sha256sum] = "9865f61f59da3b8aa32492580a8ecc9e24d251c00a5eb685678569928a2f8881"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/PPIx-Regexp-${PV}"

inherit cpan_build
inherit_defer native

do_install:append() {
    # Remove .packlist file, as it contains host specific paths
    # and doesn't serve a real purpose
    find ${D} -name ".packlist" -delete
}
