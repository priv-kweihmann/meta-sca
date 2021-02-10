SUMMARY = "Provide the stuff missing in List::Util"
HOMEPAGE = "https://metacpan.org/pod/List::MoreUtils"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/List-MoreUtils-${PV}.tar.gz"

SRC_URI[md5sum] = "daccd6310021231b827dcc943ff1c6b7"
SRC_URI[sha256sum] = "63b1f7842cd42d9b538d1e34e0330de5ff1559e4c2737342506418276f646527"

S = "${WORKDIR}/List-MoreUtils-${PV}"

inherit cpan
inherit native
