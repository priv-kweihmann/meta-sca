SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "f36baa47b78772de628d647debe82168"
SRC_URI[sha256sum] = "ad8afb77066aa71e878570e88a2c05a0ca0a13ddd76138592f656b0592d38a54"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

# Temporary fix to PV
PV = "0.068_01"

DEPENDS += "\
            libmodule-build-perl-native \
            "

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

inherit native
inherit cpan_build
