SUMMARY = "Read/Write .ini style files with as little code as possible"
HOMEPAGE = "https://metacpan.org/pod/Config::Tiny"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ab27c3cedbdb0eb6e656a8722476191a"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RS/RSAVAGE/Config-Tiny-${PV}.tgz"

SRC_URI[md5sum] = "af6a810db8ef6847034e5de8b2829860"
SRC_URI[sha256sum] = "1064948e4bc57e86e318dbc8791c53ca5b9d95b958cc474367c3277981135232"

S = "${WORKDIR}/Config-Tiny-${PV}"

inherit native
inherit cpan
