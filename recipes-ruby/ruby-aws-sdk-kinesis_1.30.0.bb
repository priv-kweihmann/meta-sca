SUMMARY = "RubyGem: aws-sdk-kinesis"
DESCRIPTION = "Official AWS Ruby gem for Amazon Kinesis (Kinesis)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "f1653f1ed5734c6b4284c1d9f5da41b3"
SRC_URI[sha256sum] = "64474fac368e82c09d39bd5ec64f931a7265f1b67ff8cf43bf802d1e54f84118"

GEM_NAME = "aws-sdk-kinesis"

inherit rubygems
