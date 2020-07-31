SUMMARY = "Parse Perl string literals and string-literal-like things"
HOMEPAGE = "https://metacpan.org/pod/PPIx::QuoteLike"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=48;md5=f65adea87f7327e8fde90145fc4d610c"

DEPENDS += "libmodule-build-perl-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/W/WY/WYANT/PPIx-QuoteLike-${PV}.tar.gz"

SRC_URI[md5sum] = "018306e0ce6a8e809935a1235dfe77bb"
SRC_URI[sha256sum] = "47fc76b9ed58e9f2296f16458786be5e906a34e3e76a8107707d453ae4e3c93c"

S = "${WORKDIR}/PPIx-QuoteLike-${PV}"

inherit native
inherit cpan_build
