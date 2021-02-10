SUMMARY = "Parse, Analyze and Manipulate Perl (without perl)"
HOMEPAGE = "https://metacpan.org/pod/PPI"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=d41d8cd98f00b204e9800998ecf8427e"

DEPENDS += "\
            perl-clone-native \
            perl-io-string-native \
            perl-params-util-native \
            perl-task-weaken-native \
           "

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MITHALDU/PPI-${PV}.tar.gz"

SRC_URI[md5sum] = "af47f2289c880be545b220fa84a4e347"
SRC_URI[sha256sum] = "622a698c781bb85d2bdf7bbfe040fe70d33b79774c9ae01fce2375dc73faf457"

S = "${WORKDIR}/PPI-${PV}"

inherit cpan
inherit native
