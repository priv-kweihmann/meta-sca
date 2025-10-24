SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "89a883c76779496b75a919f5b3934d65"
SRC_URI[sha256sum] = "e72ec79eff640297b087227d6a7708fca871c6de09997149585a98fe65ed942f"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/PPIx-Regexp-${PV}"

inherit cpan_build
inherit_defer nativesdk

do_install:append() {
    # Remove .packlist file, as it contains host specific paths
    # and doesn't serve a real purpose
    find ${D} -name ".packlist" -delete
}
