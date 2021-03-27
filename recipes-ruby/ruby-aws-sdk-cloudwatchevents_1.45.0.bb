SUMMARY = "RubyGem: aws-sdk-cloudwatchevents"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch Events"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "0d729ed4162e216feba1e9b44ae0dc0e"
SRC_URI[sha256sum] = "2101c6c9522a7aadd18e26532ad0190af3f80194f4ab26ca2a1578246e382eec"

GEM_NAME = "aws-sdk-cloudwatchevents"

inherit rubygems
