SUMMARY = "RubyGem: aws-sdk-states"
DESCRIPTION = "Official AWS Ruby gem for AWS Step Functions (AWS SFN)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "2ff74191a02ec0dba192f5203c30cce2"
SRC_URI[sha256sum] = "90296d8e5278e83aaef259e83eb4df0f8755ddaa1b51410468af65d2274c4a02"

GEM_NAME = "aws-sdk-states"

inherit rubygems
