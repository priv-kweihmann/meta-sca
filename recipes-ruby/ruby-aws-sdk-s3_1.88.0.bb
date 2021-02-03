SUMMARY = "RubyGem: aws-sdk-s3"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Storage Service (Amazon S3)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sdk-kms \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "bf909e76ecf09f335abe9428e0fd4391"
SRC_URI[sha256sum] = "fbf4352efcbf08a8ba289d36b9aff6d2da13cd99e489254d43bf77274ac63109"

GEM_NAME = "aws-sdk-s3"

inherit rubygems
