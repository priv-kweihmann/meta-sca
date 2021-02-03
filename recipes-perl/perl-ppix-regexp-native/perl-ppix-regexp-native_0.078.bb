SUMMARY = "Represent a regular expression of some sort"
HOMEPAGE = "https://metacpan.org/pod/PPIx::Regexp"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=46;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-Regexp-${PV}.tar.gz"

SRC_URI[md5sum] = "b6e924f1a8eb6915543e558ec2e1f733"
SRC_URI[sha256sum] = "b388f3ae220f54427d91874854b6980002acb366cef98438342822504774b440"

S = "${WORKDIR}/PPIx-Regexp-${PV}"

inherit native
inherit cpan_build
