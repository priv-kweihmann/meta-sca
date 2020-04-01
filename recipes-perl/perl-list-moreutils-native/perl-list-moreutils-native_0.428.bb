SUMMARY = "Provide the stuff missing in List::Util"
HOMEPAGE = "https://metacpan.org/pod/List::MoreUtils"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RE/REHSACK/List-MoreUtils-${PV}.tar.gz"

SRC_URI[md5sum] = "493032a211cdff1fcf45f59ebd680407"
SRC_URI[sha256sum] = "713e0945d5f16e62d81d5f3da2b6a7b14a4ce439f6d3a7de74df1fd166476cc2"

S = "${WORKDIR}/List-MoreUtils-${PV}"

inherit native
inherit cpan
