SUMMARY = "RubyGem: aws-sdk-kinesis"
DESCRIPTION = "Official AWS Ruby gem for Amazon Kinesis (Kinesis)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "9a618b8d2620bcc5b6ac34000a69cd73"
SRC_URI[sha256sum] = "6bde717c3b95ca2fdc780f2564df61cd3b7e989ebf0479b64a3bd99d4ec35e5e"

GEM_NAME = "aws-sdk-kinesis"

inherit rubygems
