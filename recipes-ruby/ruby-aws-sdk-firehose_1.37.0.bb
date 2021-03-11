SUMMARY = "RubyGem: aws-sdk-firehose"
DESCRIPTION = "Official AWS Ruby gem for Amazon Kinesis Firehose (Firehose)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4b32d3a4757988a95f583322d4f4376f"
SRC_URI[sha256sum] = "2ff1d6ee3e08bedb0991721fd0967bbb438ddca2f242113016533116f69782fa"

GEM_NAME = "aws-sdk-firehose"

inherit rubygems
