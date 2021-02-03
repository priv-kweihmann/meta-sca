SUMMARY = "RubyGem: aws-sdk-kinesis"
DESCRIPTION = "Official AWS Ruby gem for Amazon Kinesis (Kinesis)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "3706dba27179f9ddd1d88ff6e20c9cf4"
SRC_URI[sha256sum] = "8b3cd047e2aa5eb4cab713f90e14a95fb11234caee81707b00e5e00106b156f3"

GEM_NAME = "aws-sdk-kinesis"

inherit rubygems
