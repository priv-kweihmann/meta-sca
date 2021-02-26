SUMMARY = "RubyGem: aws-sdk-s3"
DESCRIPTION = "Official AWS Ruby gem for Amazon Simple Storage Service (Amazon S3)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sdk-kms \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "959dbc6939f6e2f5ef231d99b4f4812d"
SRC_URI[sha256sum] = "c33c8f1c4c29889816dbfb00a871b97a49cbfbfcb8067af4ac71d6802e70ecd7"

GEM_NAME = "aws-sdk-s3"

inherit rubygems
