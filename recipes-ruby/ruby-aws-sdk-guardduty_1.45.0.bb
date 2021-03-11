SUMMARY = "RubyGem: aws-sdk-guardduty"
DESCRIPTION = "Official AWS Ruby gem for Amazon GuardDuty"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "6a1e558bde0439cc7445e010ebec999a"
SRC_URI[sha256sum] = "7e0a438efd0b8c193625eb6d3ee0a74991a3bec83ac563fb4c21537f5cc27562"

GEM_NAME = "aws-sdk-guardduty"

inherit rubygems
