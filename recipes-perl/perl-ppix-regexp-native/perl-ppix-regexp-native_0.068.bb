SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "09d5640036adf9165e5a7e3306f9216e"
SRC_URI[sha256sum] = "b5444b699a3c7ad79506c796559449c6f858dc62deb60e08249f96782636e5f4"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

DEPENDS += "\
            libmodule-build-perl-native \
            "

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

inherit native
inherit cpan_build
