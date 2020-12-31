SUMMARY = "RubyGem: aws-sdk-cloudfront"
DESCRIPTION = "Official AWS Ruby gem for Amazon CloudFront (CloudFront)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "4207c07e40063d8c77dbb5891869db3a"
SRC_URI[sha256sum] = "cf6b75f114155999e30dfadc886f119f118bf9902230a668ace57f40600a7def"

GEM_NAME = "aws-sdk-cloudfront"

inherit rubygems
