SUMMARY = "parse text into an array of tokens or array of arrays"
HOMEPAGE = "https://metacpan.org/pod/Text::ParseWords"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=30;md5=e21ba77e6512164f2a40e60557f00e68"

SRC_URI = "https://cpan.metacpan.org/authors/id/C/CH/CHORNY/Text-ParseWords-${PV}.tar.gz"

SRC_URI[md5sum] = "9e98d7ba9a2eecd49c21b37d5f04a7a7"
SRC_URI[sha256sum] = "85e0238179dd43997e58c66bd51611182bc7d533505029a2db0d3232edaff5e8"

S = "${WORKDIR}/Text-ParseWords-${PV}"

inherit cpan
inherit native
