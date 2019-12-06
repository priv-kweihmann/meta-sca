SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "8db0898621e0456f85d6a78c34f40418"
SRC_URI[sha256sum] = "1aa8dee5bdefdfdbfedd3d829932cedc57502552572739766148c6ac6cc6c3f0"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

DEPENDS += "\
            libmodule-build-perl-native \
            "

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

inherit native
inherit cpan_build
