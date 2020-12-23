SUMMARY = "RubyGem: aws-sdk-s3"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Storage Service (Amazon S3)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sdk-kms \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "8f8568d30c2c19fce1e48f46d164a3d5"
SRC_URI[sha256sum] = "07ab691e6ab56d750ad77ac62b0519b2cd1ee104d58f61c9c1cf225037c45731"

GEM_NAME = "aws-sdk-s3"

inherit rubygems
