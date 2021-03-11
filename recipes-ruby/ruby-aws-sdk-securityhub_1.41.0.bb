SUMMARY = "RubyGem: aws-sdk-securityhub"
DESCRIPTION = "Official AWS Ruby gem for AWS SecurityHub"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "5f6fa203b13dbe2e0debd2d219a17622"
SRC_URI[sha256sum] = "5c326b5b82a9543fcc75f69389b65a059619a5e6dca4d7d72f75babbc2b85205"

GEM_NAME = "aws-sdk-securityhub"

inherit rubygems
