SUMMARY = "RubyGem: aws-sdk-cloudwatchevents"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudWatch Events"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "008db95c813b46b24a58e919394f04dd"
SRC_URI[sha256sum] = "2b8d9549e99b2005d0682e18557134bf737c2d1614215a6a4bf3ffe9e068706d"

GEM_NAME = "aws-sdk-cloudwatchevents"

inherit rubygems
